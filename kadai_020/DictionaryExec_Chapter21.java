package kadai_020;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		
        //インスタンス化
		Dictionary_Chapter20 dictionarySearch  = new Dictionary_Chapter20();
		
		//配列にセット
		String[] fruitArray = {"apple", "banana", "grape", "orange" };
		
		//辞書を調べる
		for(String str : fruitArray) {
			dictionarySearch.dictionary(str); 
		}

	}

}