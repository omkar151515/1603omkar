
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class matchscoreTest {
	matchscore Over1,Over2,Over3,Over4,Over5;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 
	}

	@Test
	public void test() {
		 Over1=new matchscore(0,1,2,3,4,5);
		 Over2=new matchscore(0,6,2,3,4,5);
		 Over3=new matchscore(1,1,2,3,2,3);
		 Over4=new matchscore(6,4,6,1,1,1);
		 Over5=new matchscore(2,3,2,5,6,1);
		
		System.out.println("score of match as of now is "+Over1.getTotal());
		System.out.println("score for Over 1:"+Over1.scoreperover());
		System.out.println("score for Over 2:"+Over2.scoreperover());
		System.out.println("score for Over 3:"+Over3.scoreperover());
		System.out.println("score for Over 4:"+Over4.scoreperover());
		System.out.println("score for Over 5:"+Over5.scoreperover());
		
		int totalscore=0;
		totalscore=Over1.scoreperover()+Over2.scoreperover()+Over3.scoreperover()+Over4.scoreperover()+Over5.scoreperover();
		
		System.out.println("total score after adding score from Over1-Over5 is "+totalscore);
	}

}
