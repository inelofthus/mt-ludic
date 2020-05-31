// React component for TaskView

/*
this.props:
{
	datarUrl: service URL
	task: task
	taskNum: task number
}
this.state:
{
	enabled, started, finished, description
}
 */


class TaskView extends React.Component {

	constructor(props) {
		super(props);
		this.state = this.props;
	}

	displayName() {
		return "Task view component"
	}

  	render() {
		let task = this.props.task;
		let taskState = null;
  		if (this.state.task.finished) {
  			taskState = "finished";
  		} else if (this.state.task.started) {
  			taskState = "started";
  		} else if (this.state.task.enabled) {
  			taskState = "enabled";
  		}

		let distance = `${task.distance} m`;
		if (task.distance > 1000) {
			distance = `${Math.floor(task.distance/1000)} km`;
		}
		let distanceText = `You are ${distance} away`;
			
		let openDate = new Date(task.closeTime).toLocaleString().slice(0, -3);
		
  		let taskLink = AppUtils.appUrl(this.props.dataUrl, { taskState: taskState });
    	return React.createElement("div", null,
			React.createElement("h2", {id: "taskDescription"}, task.description),
			React.createElement("a", { href: taskLink}, "Start task"),
			React.createElement("p", null, distanceText),
			task.closeTime && React.createElement("p", null, `Open until ${openDate}`),
			React.createElement("p", null, `Active players: ${task.numberOfActivePlayers}`)
		);
  	}
}
