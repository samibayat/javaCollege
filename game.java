public class game
{
	String gameName;
	int score;
	String playerName;
	public int getscore()
	{
	return score;
	}
	public String getgameName()
	{
	return gameName;
	}
	public String getplayerName()
	{
	return playerName;
	}

	public void setscore(int score)
	{
	this.score=score;
	}
	public void setgameName(String gameName)
	{
	this.gameName=gameName;
	}

	public void setplayerName(String playerName)
	{
	this.playerName=playerName;
	}
	public game(){
	gameName="pubg";
	score=400;
	playerName="sami";
	}
	public game(String gameName,int score,String playerName)
	{
	this.score=score;
	this.gameName=gameName;
	this.playerName=playerName;
	}
	void Display(){
	System.out.println(score);
	System.out.println(playerName);
	System.out.println(gameName);
	}



	
}


