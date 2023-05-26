abstract class PairMap{
    protected String keyArray [];
    protected String valueArray [];
    abstract String get(String key);
    abstract void put(String key, String value);
    abstract String delete(String key);
    abstract int length();
}
class Dictionary extends PairMap{
    public Dictionary(int num){
        this.keyArray = new String[num];
        this.valueArray = new String[num];
    }
    @Override
    public String get(String key){
        for(int i = 0; i< keyArray.length; i++){
            if (keyArray[i] == key){
                return valueArray[i];
            }
        }
        return null;
    }
    @Override
    public void put(String key, String value){
        for(int i = 0; i<keyArray.length; i++){
            if (keyArray[i] == key){
                valueArray[i] = value;
                break;
            }
            else if (keyArray[i] == null){
                keyArray[i] = key;
                valueArray[i] = value;
                break;
            }
        }
    }
    @Override
    public String delete(String key){
        String returnValue = null;
        for(int i = 0; i<keyArray.length; i++){
            if(keyArray[i] == key){
                keyArray[i] = null;
                returnValue = valueArray[i];
                valueArray[i] = null;
            }
        }
        return returnValue;
    }
    @Override
    public int length(){
        return 0;
    }
}
public class DictionaryApp {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이썬");
        dic.put("이재문", "C++");
        System.out.println("이재문의 값은 "+ dic.get("이재문"));
        System.out.println("황기태의 값은 "+ dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 "+ dic.get("황기태"));
    }
}
