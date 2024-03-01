public class ex1 {
    static int evaluateExpression(String expression) {
        int result = 0;
        int prev = 0;
        int evaluate = 0;
        for (int i = 0; i < expression.length(); i++) {
            if((expression.charAt(i) == '+') || (expression.charAt(i) == '-')) {
                if(evaluate==0) {
                    result = Integer.valueOf(expression.substring(prev, i));
                } else if(evaluate==1) {
                    result+=Integer.valueOf(expression.substring(prev, i));
                } else if(evaluate==-1) {
                    result-=Integer.valueOf(expression.substring(prev, i));
                }
                
                prev = i+1;
                
                if((expression.charAt(i) == '+') )evaluate=1;
                else evaluate = -1;
            }
        }
        if(evaluate==1) {
            result+=Integer.valueOf(expression.substring(prev));
        } else if(evaluate==-1) {
            result-=Integer.valueOf(expression.substring(prev));
        } else if(evaluate==0) {
            result=Integer.valueOf(expression.substring(prev));
        }
        return result;
    }

    public static void main(String[] args) {
        String example = "5+20-8+5";
        System.out.println(evaluateExpression(example));
    }

}