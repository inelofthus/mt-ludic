/*
this.props:
{
	dataUrl: the url that returns the current Game object
	player: { person : { } }
	taskViews: [ ]
	itemViews: [ ]
}
this.state:
{
	player: { person : { } }
	taskViews: [ ]
	itemViews: [ ]
}
*/

class LeaderboardGameView extends React.Component {

	constructor(props) {
		super(props);
		this.state = props;
		this.setPlayerPosition = this.setPlayerPosition.bind(this);
		this.navigate = this.navigate.bind(this);
		this.toggleLeaderboard = this.toggleLeaderboard.bind(this);
		this.toggleTeam = this.toggleTeam.bind(this);
		console.log(this.state);
	}

	displayName() {
		return "Game view component";
	}
	
	componentDidMount() {
		this.setState({
			buttonText:"Show leaderboard", leaderboardToggled:"false", 
			buttonTeamText: "Show team", teamToggled: "false"});
		AppUtils.log("Did mount...");
		window.addEventListener('pageshow', function(event) {
			AppUtils.log("pageshow");
		});
		window.addEventListener('popstate', function(event) {
			AppUtils.log("popstate");
		});
		
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
		AppUtils.loadData(updateUrl, false, newState, function(locationTaskView) {
			comp.setState(locationTaskView);
		});
	}
	
	navigate(center, zoom) {
		AppUtils.submitData(this.props.dataUrl + "/mapView/navigate?latitude=" + center.lat + "&longitude=" + center.lng + "&zoom=" + zoom);
	}
	
	toggleLeaderboard(){
		console.log(this.state);
		let buttonText;
		if (this.state.leaderboardToggled){
			document.getElementById("leaderboard").style.display = "block";
			document.getElementById("map").style.display = "none";
			buttonText = "Show map";
		} else {
			document.getElementById("leaderboard").style.display = "none";
			document.getElementById("map").style.display = "block";
			buttonText = "Show leaderboard";
		}
		this.setState({leaderboardToggled: !this.state.leaderboardToggled, buttonText: buttonText});	
	}
	
	toggleTeam(){
		let buttonTeamText;
		if (this.state.teamToggled){
			document.getElementById("teamBoard").style.display = "table";
			document.getElementById("playerBoard").style.display = "none";
			buttonTeamText = "Solo";
		} else {
			document.getElementById("teamBoard").style.display = "none";
			document.getElementById("playerBoard").style.display = "table";
			buttonTeamText = "Team";
		}
		this.setState({teamToggled: !this.state.teamToggled, buttonTeamText: buttonTeamText});	
	}


  	render() {
		let dataUrl = this.props.dataUrl;
	
		let markers = [{
				latitude: this.state.locationLatitude, longitude: this.state.locationLongitude,
				text: "You're here",
				radius: undefined,
				color: "yellow"
			}]
		
		this.state.taskViews.map(function(task, idx) {
			if (!task.isCompletedByPlayer && task.enabled){
				let color = task.active ? "blue" : "green";
				
				markers.push(
					{
						latitude: task.taskLocationLatitude, longitude: task.taskLocationLongitude,
						text: React.createElement(TaskView, { dataUrl: dataUrl + '/taskViews/' + idx, task: task, taskNum: (idx + 1) }),
						radius: 10,
						color: color
					}
				)
			}
			
		});
		
  		let mapViewProps = {
			centerLatitude: this.state.mapView.latitude, centerLongitude: this.state.mapView.longitude,
			zoom: this.state.mapView.zoom,
			markers: markers,
			clientPositionHandler: this.setPlayerPosition,
			// markerPositionHandler: ...
			navigateHandler: this.navigate
		};
		
		let leadRows = [];		
		let entryPosition = 0;
		for (const [key, value] of Object.entries(this.state.leaderboard)){
			leadRows.push(React.createElement(
				"tr", {key: key},
					React.createElement(
						"td", {className: "leaderboardNum"},
							React.createElement("p", null, `${entryPosition+=1}.`)
					),
					React.createElement(
						"td", {className: "leaderboardPlayer"},
							React.createElement("p", null, key)
					),
					React.createElement(
						"td", {className: "leaderboardScore"},
							React.createElement("p", null, value)
					),
			))
		}
		
		entryPosition = 0;
		let teamRows = [];
		for (const [key, value] of Object.entries(this.state.teamLeaderboard)){
			teamRows.push(React.createElement(
				"tr", {key: key},
					React.createElement(
						"td", {className: "leaderboardNum"},
							React.createElement("p", null, `${entryPosition+=1}.`)
					),
					React.createElement(
						"td", {className: "leaderboardPlayer"},
							React.createElement("p", null, key)
					),
					React.createElement(
						"td", {className: "leaderboardScore"},
							React.createElement("p", null, value)
					),
			))
		}
		
    	return React.createElement("div", { className: "game" },
			React.createElement("h2", null, "LUDIC"),
			React.createElement("div", { className: "map", id: "map" },
				React.createElement(MapView, mapViewProps)
			),
			React.createElement("div", {id: "leaderboard"},
				React.createElement("h3", null, "Leaderboard"),
				React.createElement("table", {className: "table", id: "playerBoard"},
					React.createElement("tbody", null, leadRows)
				),
				React.createElement("table", {className: "table", id: "teamBoard", style: {display: "none"}},
					React.createElement("tbody", null, teamRows)
				),
				React.createElement("div", {className: "buttondiv"},
					React.createElement("button", { onClick: this.toggleTeam, className: "button"}, this.state.buttonTeamText),
				),
			),
			React.createElement("div", {className: "buttondiv"},
				React.createElement("button", { onClick: this.toggleLeaderboard, className: "button"}, this.state.buttonText),
			),
			
		);
  	}
}
