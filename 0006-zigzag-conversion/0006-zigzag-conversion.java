class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || numRows>=s.length()){
            return s;
        }

        StringBuilder[] rows=new StringBuilder[numRows];

        for(int i=0;i<numRows;i++){
            rows[i]=new StringBuilder();
        }

        int currRow=0;
        boolean goingDown=false;

        for(char ch:s.toCharArray()){
            rows[currRow].append(ch);

            if(currRow==0||currRow==numRows-1){
                goingDown=!goingDown;
            }
            if(goingDown){
                currRow++;
            }else{
                currRow--;
            }
        }

        StringBuilder res=new StringBuilder("");
        for(StringBuilder ch:rows){
            res.append(ch);
        }
        return res.toString();
    }
}