import java.util.Date;

/**
 * @author maguobao
 * @date 2018/07/28
 * @time 21:24
 */
public class StudtBenutl {

	private Integer id;
	private String name;
	private Date gmtCreate;
	private Date gmtModified;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	@Override
	public String toString() {
		return "StudtBenutl{" +
				"id=" + id +
				", name='" + name + '\'' +
				", gmtCreate=" + gmtCreate +
				", gmtModified=" + gmtModified +
				'}';
	}
}
