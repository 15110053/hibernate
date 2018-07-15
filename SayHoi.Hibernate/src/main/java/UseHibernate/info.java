package UseHibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class info {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private int FirstNum;
	
	@Column
	private int LastNum;
	
	@Column
	private String operator;
	
	@Column
	private double result;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFirstNum() {
		return FirstNum;
	}

	public void setFirstNum(int firstNum) {
		FirstNum = firstNum;
	}

	public int getLastNum() {
		return LastNum;
	}

	public void setLastNum(int lastNum) {
		LastNum = lastNum;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
	
}
