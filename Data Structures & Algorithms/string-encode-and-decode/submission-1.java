class Solution {

    public String encode(List<String> strs) {
        String concat = "";
        String secret="sadsajdjasspdja";
        String empty = "aio34t"; // handles empty string

        for(String str: strs){
            if(str.length()==0){
                // special case
                concat = concat.concat(empty);
            }
            else{
                concat = concat.concat(str);
            }
            // joiner
            concat = concat.concat(secret);
        }

        return concat;
    }

    public List<String> decode(String str) {
        System.out.println(str);
        if(str.equals("")){
             return new ArrayList<>();
        }
        String secret="sadsajdjasspdja";
        String empty = "aio34t"; // handles empty string

        String[] result = str.split(secret);
        
        for(int i = 0 ; i<result.length;i++){
            if(result[i].equals(empty)){
                result[i]="";
            }
        }
        ArrayList<String> ans = new ArrayList<>(List.of(result));
        return ans;
    }
}
