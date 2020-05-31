// React component for App

/*
this.props:
{
	locationLatitude: 63.41929, locationLongitude: 10.401694,
	hint: "You are far away...",
	mapView: {
		latitude: 63.41929, longitude: 10.401694, zoom: 13
	}
}

this.state:
{
	locationLatitude: 63.41929, locationLongitude: 10.401694,
	hint: "You are far away...",
	mapView: {
		centerLatitude: 63.41929, centerLongitude: 10.401694, zoom: 13,
		markers: [{
			latitude: 63.41929, longitude: 10.401694,
			text: "You're here",
			radius: 0, // > 0 = circle, < 0 = circle marker, 0 or undefined = marker
		}],
	}
}
 */
class PuzzleTaskView extends React.Component {

	constructor(props) {
		super(props);
		this.state = {loading: true};
		console.log(this.state);
		// make sure this in callback functions refers to this
		this.setPlayerPosition = this.setPlayerPosition.bind(this);
/*		this.navigate = this.navigate.bind(this);
		this.tryLocation = this.tryLocation.bind(this);*/
		this.proposeAnswer = this.proposeAnswer.bind(this);
		this.navigateReturnUrl = this.navigateReturnUrl.bind(this);
		this.handleChange = this.handleChange.bind(this);
		this.acceptPlayer = this.acceptPlayer.bind(this);
	}
	
	componentDidMount() {
		console.log("mounted");
		this.acceptPlayer();
		this.setState({loading: false});
	}
	
	acceptPlayer(){
		console.log("Accept");
		let that = this;
		let updateUrl = this.props.dataUrl + "/acceptPlayer";
		AppUtils.loadData(updateUrl, false, null, function(puzzleTaskView){
			that.setState(puzzleTaskView);
		});
	}

	displayName() {
		return "Puzzle task view";
	}

	setPlayerPosition(position) {
		AppUtils.log("Player location changed: " + position);
		var latitude = position.coords.latitude, longitude = position.coords.longitude;
		var newState = {
			locationLatitude: latitude, locationLongitude: longitude, 
		};
		this.setState(newState);
		var comp = this;
		var updateUrl = this.props.dataUrl + "/setPlayerLocation?latitude=" + latitude + "&longitude=" + longitude;
		AppUtils.loadData(updateUrl, false, newState, function(puzzleTaskView) {
			comp.setState(puzzleTaskView);
		});
	}
	
/*	navigate(center, zoom) {
		AppUtils.submitData(this.props.dataUrl + "/mapView/navigate?latitude=" + center.lat + "&longitude=" + center.lng + "&zoom=" + zoom);
	}*/

/*	tryLocation() {
		AppUtils.log("Trying player location: " + this.state.locationLatitude + ", " + this.state.locationLongitude);
		var comp = this;
		var updateUrl = this.props.dataUrl + "/tryFinish";
		AppUtils.loadData(updateUrl, false, false, function(finished) {
			comp.setState({ isFinished: finished });
		});
	}
*/

	proposeAnswer() {
		AppUtils.log("Submitting answer: " + this.state.answer);
		let that = this;
		let updateUrl = this.props.dataUrl + "/proposeAnswer?proposal=" + this.state.answer;
		AppUtils.loadData(updateUrl, false, null, function(newState){
			that.setState(newState);
		});
		
	}
	
	navigateReturnUrl() {
		if (typeof this.props.returnUrl !== 'undefined') {
			window.location.href = this.props.returnUrl;
		}
	}
	
	handleChange(e) {
		this.setState({answer: e.currentTarget.value});
	}
	
	render() {
		const e = React.createElement;
		if (this.state.loading){
			return e("h3", {className: "loading"}, "loading");
		} else {
			let buttonText = (this.props.isFinished ? "Try again" : "Submit answer");
			return e("div", { className: "puzzleTask" },
				e("h3", { className: "description" }, this.props.description),
				e("p", { className: "score" }, `Score: ${this.props.score}`),
				e("p", { className: "level" }, `Level: ${this.props.level}`),
				e("p", { className: "puzzleImage" }, this.props.image),
				e('input', { placeholder: 'Enter your answer', autoFocus: true, onChange: this.handleChange}),
				e("button", { onClick: this.proposeAnswer }, buttonText),
				e("button", { className: "back", onClick: this.navigateReturnUrl }, "Back to task list"),
			);
		}
	}
}
