class Game{
	int score;
	String game;
	String player;
	public Game()
	{
	game="criket";
	score= 0;
	player="samiullah";
	}
	public Game(String game,String player,int score)
	{
		System.out.println("score = "+ score);
		System.out.println("plyer ="+ player);
		System.out.println("game ="+ game);
	}
	void display()
	{ //I have made a change
	System.out.println(score);
	System.out.println(score);
	System.out.println(score);
	}
}

