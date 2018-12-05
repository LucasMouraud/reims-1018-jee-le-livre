
public class Page {

	private int id;
	private String content;
	private int[] nextPages;

	public Page(int id, String content, int[] nextPages){
		this.id = id;
		this.content = content;
		this.nextPages = nextPages;
	}

	public int getId(){
		return this.id;
	}

	public void setId(int id){
		this.id = id;
	}

	public String getContent(){
		return this.content;
	}

	public void setContent(String content){
		this.content = content;
	}

	public int[] getNextPages(){
		return this.nextPages;
	}

	public void setNextPages(int[] id){
		this.nextPages = nextPages;
	}

}
