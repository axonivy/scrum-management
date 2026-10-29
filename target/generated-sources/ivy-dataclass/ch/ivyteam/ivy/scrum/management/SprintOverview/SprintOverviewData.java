package ch.ivyteam.ivy.scrum.management.SprintOverview;

/**
 */
@SuppressWarnings("all")
@jakarta.annotation.Generated(comments="This is the java file of the ivy data class SprintOverviewData", value={"ch.ivyteam.ivy.scripting.dataclass.restricted.codegen.DataClassJavaSourceGenerator"})
public class SprintOverviewData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 804331114982781943L;

  private transient ch.ivyteam.ivy.scrum.management.Sprint sprint;

  /**
   * Gets the field sprint.
   * @return the value of the field sprint; may be null.
   */
  public ch.ivyteam.ivy.scrum.management.Sprint getSprint()
  {
    return sprint;
  }

  /**
   * Sets the field sprint.
   * @param _sprint the new value of the field sprint.
   */
  public void setSprint(ch.ivyteam.ivy.scrum.management.Sprint _sprint)
  {
    sprint = _sprint;
  }

  private transient java.lang.Double totalPoints;

  /**
   * Gets the field totalPoints.
   * @return the value of the field totalPoints; may be null.
   */
  public java.lang.Double getTotalPoints()
  {
    return totalPoints;
  }

  /**
   * Sets the field totalPoints.
   * @param _totalPoints the new value of the field totalPoints.
   */
  public void setTotalPoints(java.lang.Double _totalPoints)
  {
    totalPoints = _totalPoints;
  }

  private transient java.lang.Integer sprintIndex;

  /**
   * Gets the field sprintIndex.
   * @return the value of the field sprintIndex; may be null.
   */
  public java.lang.Integer getSprintIndex()
  {
    return sprintIndex;
  }

  /**
   * Sets the field sprintIndex.
   * @param _sprintIndex the new value of the field sprintIndex.
   */
  public void setSprintIndex(java.lang.Integer _sprintIndex)
  {
    sprintIndex = _sprintIndex;
  }

}
