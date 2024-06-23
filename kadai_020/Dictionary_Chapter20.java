package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {

	
		//HashMapの宣言
	public void dictionary(String word) {
		HashMap<String,String> fruitMap = new HashMap<String,String>();
		
		//英単語と意味を追加
		fruitMap.put("apple","りんご");
		fruitMap.put("peach","桃");
		fruitMap.put("banana","バナナ");
		fruitMap.put("lemon",	"レモン");
		fruitMap.put("pear","梨");
		fruitMap.put("kiwi","キウィ");
		fruitMap.put("strawberry","いちご");
		fruitMap.put("grape","ぶどう");
		fruitMap.put("muscat","マスカット");
		fruitMap.put("cherry","さくらんぼ");

		//辞書に追加されているか判定
		if(fruitMap.get(word) != null) {
			System.out.println(word + "の意味は" + fruitMap.get(word));
		} else {
			System.out.println(word + "は辞書に存在しません");
		}
	}
}