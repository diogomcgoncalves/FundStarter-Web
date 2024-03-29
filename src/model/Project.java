package model;

public class Project {
	
	private int projectId;
	private String dateEnd;
	private String projectName;
	private int moneyRaised;
	private int objective;
	private String projectDescription;
	private int percentageComplete;
	
	public Project()
	{
		super();
	}
	
	public Project(int projectId, String dateEnd, String projectName, int moneyRaised, int objective,
			String projectDescription) {
		super();
		this.projectId = projectId;
		this.dateEnd = dateEnd;
		this.projectName = projectName;
		this.moneyRaised = moneyRaised;
		this.objective = objective;
		this.projectDescription = projectDescription;
	}
	
	public int getPercentageComplete() {
		return percentageComplete;
	}

	public void setPercentageComplete(int percentageComplete) {
		this.percentageComplete = percentageComplete;
	}

	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getDateEnd() {
		return dateEnd;
	}
	public void setDateEnd(String dateEnd) {
		this.dateEnd = dateEnd;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public int getMoneyRaised() {
		return moneyRaised;
	}
	public void setMoneyRaised(int moneyRaised) {
		this.moneyRaised = moneyRaised;
	}
	public int getObjective() {
		return objective;
	}
	public void setObjective(int objective) {
		this.objective = objective;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", dateEnd=" + dateEnd + ", projectName=" + projectName
				+ ", moneyRaised=" + moneyRaised + ", objective=" + objective + ", projectDescription="
				+ projectDescription + ", percentageComplete=" + percentageComplete + "]";
	}
}
