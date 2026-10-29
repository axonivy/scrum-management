package ch.ivyteam.ivy.scrum.management;

/**
 */
@SuppressWarnings("all")
@jakarta.annotation.Generated(comments="This is the java file of the ivy data class Sprint", value={"ch.ivyteam.ivy.scripting.dataclass.restricted.codegen.DataClassJavaSourceGenerator"})
public class Sprint extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 9176740500103800590L;

  private java.lang.String versionCode;

  /**
   * Gets the field versionCode.
   * @return the value of the field versionCode; may be null.
   */
  public java.lang.String getVersionCode()
  {
    return versionCode;
  }

  /**
   * Sets the field versionCode.
   * @param _versionCode the new value of the field versionCode.
   */
  public void setVersionCode(java.lang.String _versionCode)
  {
    versionCode = _versionCode;
  }

  private java.lang.Number sprintNumber;

  /**
   * Gets the field sprintNumber.
   * @return the value of the field sprintNumber; may be null.
   */
  public java.lang.Number getSprintNumber()
  {
    return sprintNumber;
  }

  /**
   * Sets the field sprintNumber.
   * @param _sprintNumber the new value of the field sprintNumber.
   */
  public void setSprintNumber(java.lang.Number _sprintNumber)
  {
    sprintNumber = _sprintNumber;
  }

  private ch.ivyteam.ivy.scripting.objects.Date startDate;

  /**
   * Gets the field startDate.
   * @return the value of the field startDate; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.Date getStartDate()
  {
    return startDate;
  }

  /**
   * Sets the field startDate.
   * @param _startDate the new value of the field startDate.
   */
  public void setStartDate(ch.ivyteam.ivy.scripting.objects.Date _startDate)
  {
    startDate = _startDate;
  }

  private ch.ivyteam.ivy.scripting.objects.Date endDate;

  /**
   * Gets the field endDate.
   * @return the value of the field endDate; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.Date getEndDate()
  {
    return endDate;
  }

  /**
   * Sets the field endDate.
   * @param _endDate the new value of the field endDate.
   */
  public void setEndDate(ch.ivyteam.ivy.scripting.objects.Date _endDate)
  {
    endDate = _endDate;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.scrum.management.SprintUser> members;

  /**
   * Gets the field members.
   * @return the value of the field members; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.scrum.management.SprintUser> getMembers()
  {
    return members;
  }

  /**
   * Sets the field members.
   * @param _members the new value of the field members.
   */
  public void setMembers(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.scrum.management.SprintUser> _members)
  {
    members = _members;
  }

  private java.lang.Number maxWorkingDays;

  /**
   * Gets the field maxWorkingDays.
   * @return the value of the field maxWorkingDays; may be null.
   */
  public java.lang.Number getMaxWorkingDays()
  {
    return maxWorkingDays;
  }

  /**
   * Sets the field maxWorkingDays.
   * @param _maxWorkingDays the new value of the field maxWorkingDays.
   */
  public void setMaxWorkingDays(java.lang.Number _maxWorkingDays)
  {
    maxWorkingDays = _maxWorkingDays;
  }

  private java.lang.Number sprintPointsPerDay;

  /**
   * Gets the field sprintPointsPerDay.
   * @return the value of the field sprintPointsPerDay; may be null.
   */
  public java.lang.Number getSprintPointsPerDay()
  {
    return sprintPointsPerDay;
  }

  /**
   * Sets the field sprintPointsPerDay.
   * @param _sprintPointsPerDay the new value of the field sprintPointsPerDay.
   */
  public void setSprintPointsPerDay(java.lang.Number _sprintPointsPerDay)
  {
    sprintPointsPerDay = _sprintPointsPerDay;
  }

  private java.lang.Integer sortIndex;

  /**
   * Gets the field sortIndex.
   * @return the value of the field sortIndex; may be null.
   */
  public java.lang.Integer getSortIndex()
  {
    return sortIndex;
  }

  /**
   * Sets the field sortIndex.
   * @param _sortIndex the new value of the field sortIndex.
   */
  public void setSortIndex(java.lang.Integer _sortIndex)
  {
    sortIndex = _sortIndex;
  }

}
