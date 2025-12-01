public class MagicEightBall{
	public MagicEightBall(){
	}
	private String a = "It is certain";
	private String b = "It is decidedly so";
	private String c = "Without a doubt";
	private String d = "Yes definitely";
	private String e = "You may rely on it";
	private String f = "As I see it, yes";
	private String g = "Most likely";
	private String h = "Outlook good";
	private String i = "Yes";
	private String j = "Signs point to yes";
	private String k = "Reply hazy, try again";
	private String l = "Ask again later";
	private String m = "Better not tell you now";
	private String n = "Cannot predict now";
	private String o = "Concentrate and ask again";
	private String p = "Don't count on it";
	private String q = "My reply is no";
	private String r = "My sources say no";
	private String s = "Outlook not so good";
	private String t = "Very doubtful";
	private String u = "BOOOOOOOOOMBOOOOOOBCLAT";
	public String ask(String Watchuwant){
		int random = (int)(Math.random()*21+1);
		if(random == 1){
			return a;
		}if(random == 2){
			return b;
		}if(random == 3){
			return c;
		}
		if(random == 4){
			return d;
		}
		if(random == 5){
			return e;
		}
		if(random == 6){
			return f;
		}
		if(random == 7){
			return g;
		}
		if(random == 8){
			return h;
		}
		if(random == 9){
			return i;
		}
		if(random == 10){
			return j;
		}
		if(random == 11){
			return k;
		}
		if(random == 12){
			return l;
		}
		if(random == 13){
			return m;
		}
		if(random == 14){
			return n;
		}
		if(random == 15){
			return o;
		}
		if(random == 16){
			return p;
		}
		if(random == 17){
			return q;
		}
		if(random == 18){
			return r;
		}
		if(random == 19){
			return s;
		}
		if(random == 20){
			return t;
		}
		if(random == 21){
			return u;
		}else{
			return u;
		}
	}


}
