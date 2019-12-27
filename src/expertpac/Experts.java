package expertpac;

public class Experts extends Account {

	private String exp_name;
	private String exp_rateid;
	private String exp_skill;
	private String exp_locationid;

	public void viewUserdetail() {
		throw new UnsupportedOperationException();
	}

	public void chat() {
		throw new UnsupportedOperationException();
	}

	public void viewLocation() {
		throw new UnsupportedOperationException();
	}

	public String getExp_name() {
		return exp_name;
	}

	public void setExp_name(String exp_name) {
		this.exp_name = exp_name;
	}

	public String getExp_rateid() {
		return exp_rateid;
	}

	public void setExp_rateid(String exp_rateid) {
		this.exp_rateid = exp_rateid;
	}

	public String getExp_skill() {
		return exp_skill;
	}

	public void setExp_skill(String exp_skill) {
		this.exp_skill = exp_skill;
	}

	public String getExp_locationid() {
		return exp_locationid;
	}

	public void setExp_locationid(String exp_locationid) {
		this.exp_locationid = exp_locationid;
	}
	public void printExpInfo() {
		System.out.println("the Expert info\n" +  getExp_name() +" is "+getExp_skill()+"\n" );
	}

	 
}
