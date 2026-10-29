package ch.ivyteam.ivy.scrum.management;

/**
 */
@SuppressWarnings("all")
@jakarta.annotation.Generated(comments="This is the java file of the ivy data class EditSprintData", value={"ch.ivyteam.ivy.scripting.dataclass.restricted.codegen.DataClassJavaSourceGenerator"})
public class EditSprintData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -8194177865140942437L;

  private java.lang.Boolean save;

  /**
   * Gets the field save.
   * @return the value of the field save; may be null.
   */
  public java.lang.Boolean getSave()
  {
    return save;
  }

  /**
   * Sets the field save.
   * @param _save the new value of the field save.
   */
  public void setSave(java.lang.Boolean _save)
  {
    save = _save;
  }

  private java.lang.String sprintId;

  /**
   * Gets the field sprintId.
   * @return the value of the field sprintId; may be null.
   */
  public java.lang.String getSprintId()
  {
    return sprintId;
  }

  /**
   * Sets the field sprintId.
   * @param _sprintId the new value of the field sprintId.
   */
  public void setSprintId(java.lang.String _sprintId)
  {
    sprintId = _sprintId;
  }

  private ch.ivyteam.ivy.scrum.management.Sprint sprint;

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

  private java.lang.Number taskIndex;

  /**
   * Gets the field taskIndex.
   * @return the value of the field taskIndex; may be null.
   */
  public java.lang.Number getTaskIndex()
  {
    return taskIndex;
  }

  /**
   * Sets the field taskIndex.
   * @param _taskIndex the new value of the field taskIndex.
   */
  public void setTaskIndex(java.lang.Number _taskIndex)
  {
    taskIndex = _taskIndex;
  }

}
