

public class matchscore {
	int ball1;
	int ball2;
	int ball3;
	int ball4;
	int ball5;
	int ball6;
	int total=0;
	int scorepo=0;
	
	
	
public int getBall1() {
		return ball1;
	}

	public void setBall1(int ball1) {
		this.ball1 = ball1;
	}

	public int getBall2() {
		return ball2;
	}

	public void setBall2(int ball2) {
		this.ball2 = ball2;
	}

	public int getBall3() {
		return ball3;
	}

	public void setBall3(int ball3) {
		this.ball3 = ball3;
	}

	public int getBall4() {
		return ball4;
	}

	public void setBall4(int ball4) {
		this.ball4 = ball4;
	}

	public int getBall5() {
		return ball5;
	}

	public void setBall5(int ball5) {
		this.ball5 = ball5;
	}

	public int getBall6() {
		return ball6;
	}

	public void setBall6(int ball6) {
		this.ball6 = ball6;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getScorepo() {
		return scorepo;
	}

	public void setScorepo(int scorepo) {
		this.scorepo = scorepo;
	}



public  matchscore(int ball1,int ball2,int ball3,int ball4,int ball5,int ball6)
{
	this.ball1=ball1;
	this.ball2=ball2;
	this.ball3=ball3;
	this.ball4=ball4;
	this.ball5=ball5;
	this.ball6=ball6;
}

public int scoreperover()
{
 scorepo=(this.getBall1()+this.getBall2()+this.getBall3()+this.getBall4()+this.getBall5()+this.getBall6());
 //System.out.println("score per this over is "+scorepo);
 return scorepo;
}
public int total()
{
	//System.out.println("total score as of now is "+(total+scorepo));
	total=total+this.scoreperover();
	return total;
}
}