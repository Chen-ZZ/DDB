package domain;

/**
 * GroupingId entity. @author MyEclipse Persistence Tools
 */

public class GroupingId implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer groupId;
	private Integer subjectId;

	// Constructors

	/** default constructor */
	public GroupingId() {
	}

	/** full constructor */
	public GroupingId(Integer id, Integer groupId, Integer subjectId) {
		this.id = id;
		this.groupId = groupId;
		this.subjectId = subjectId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public Integer getSubjectId() {
		return this.subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof GroupingId))
			return false;
		GroupingId castOther = (GroupingId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getGroupId() == castOther.getGroupId()) || (this
						.getGroupId() != null && castOther.getGroupId() != null && this
						.getGroupId().equals(castOther.getGroupId())))
				&& ((this.getSubjectId() == castOther.getSubjectId()) || (this
						.getSubjectId() != null
						&& castOther.getSubjectId() != null && this
						.getSubjectId().equals(castOther.getSubjectId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getGroupId() == null ? 0 : this.getGroupId().hashCode());
		result = 37 * result
				+ (getSubjectId() == null ? 0 : this.getSubjectId().hashCode());
		return result;
	}

}