class PuzzleTaskView extends React.Component {

	constructor(props) {
		super(props);
		this.state = {loading: true};
		this.proposeAnswer = this.proposeAnswer.bind(this);
		this.navigateReturnUrl = this.navigateReturnUrl.bind(this);
		this.handleChange = this.handleChange.bind(this);
		this.quit = this.quit.bind(this);
		this.calculateTimeLeft = this.calculateTimeLeft.bind(this);
	}

	displayName() {
		return "Puzzle task";
	}
	
	componentDidMount(){
		if (this.props.closeTime){
			this.calculateTimeLeft();
			setInterval(this.calculateTimeLeft, 1000);
		}
	}

	proposeAnswer() {
		AppUtils.log("Submitting answer: " + this.state.answer);
		let that = this;
		let updateUrl = this.props.dataUrl + "/proposeAnswer?proposal=" + this.state.answer;
		AppUtils.loadData(updateUrl, false, null, function(isCorrect){
			that.setState({prevAnswerCorrect: isCorrect});
			if (!isCorrect) {
				document.getElementById("wrongAnswer").style.visibility = "visible";
			}
		});
	}
	
	quit(){
		let updateUrl = this.props.dataUrl + "/quitPuzzle";
		this.setState({quit: true});
		AppUtils.submitData(updateUrl);
	}
	
	navigateReturnUrl() {
		if (typeof this.props.returnUrl !== 'undefined') {
			window.location.href = this.props.returnUrl;
		}
	}
	
	handleChange(e) {
		this.setState({answer: e.currentTarget.value});
	}
	
	calculateTimeLeft() {
		let ms = this.props.closeTime - Date.now();
		
		let seconds = Math.floor(ms / 1000) % 60;
 		let minutes = Math.floor(ms / (1000*60)) % 60;
  		let hours = Math.floor(ms /(1000*60*60)) % 24;   
		let days = Math.floor(ms / (10000*60*60*24));
		
		let formattedString;
		
		if(days>0) {
			formattedString = (`${days} days`)
		} else {
			if (hours<1){hours=""}else{hours=`${hours}:`}
			if (minutes<10){minutes="0"+minutes};
			if (seconds<10){seconds="0"+seconds};
			formattedString = `${hours}${minutes}:${seconds}`
		}
		
		this.setState({countdown: formattedString});
	}
	
	
	
	render() {
	const e = React.createElement;
		if (this.state.prevAnswerCorrect || this.state.quit){
			let text = "";
			if (this.state.prevAnswerCorrect) {text = "Your answer is correct!"};
			return e("div", { className: "puzzleTask" }, 
				e("h2", null, "LUDIC"),
				e("h3", { className: "description" }, this.props.description),
				e("p", {id: "correctAnswer"}, text),
				e("div", {className: "buttondiv"},
					e("button", { className: "button", onClick: this.navigateReturnUrl }, "Back to map"),
				)
			);
		}
		
		let buttonText = (this.props.isFinished ? "Try again" : "Submit answer");
		return e("div", { className: "puzzleTask" },
			e("div", {className:"puzzleTaskMain"},
				e("h2", null, "LUDIC"),
				this.props.description && e("h3", { className: "description" }, this.props.description),
				this.props.instructions && e("p", {id: "instructions"}, this.props.instructions),
				this.state.countdown && e("p", {id: "timeLeft"}, this.state.countdown),
				e("div", {className: "puzzleContent", dangerouslySetInnerHTML: {__html: this.props.content}}),
				e("div", {id: "inputdiv"}, 
					e("input", { className: "input", placeholder: 'Enter your answer', autoFocus: true, onChange: this.handleChange}),
				),
				e("p", {id: "wrongAnswer"}, "Wrong answer, try again."),
				e("div", {className: "buttondiv"},
					e("button", { className: "button", onClick: this.proposeAnswer }, buttonText),
				),
			),
			e("div", {className: "buttondiv"},
				e("button", { className: "button", id: "quitButton", onClick: this.quit }, "Quit task"),
			)
		);
	}
}
