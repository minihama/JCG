public class main{
    public static void main(String []args){
       int i, j;
       for(j=0, i=0;i<=5;i++){
           j += i;
           System.out.print(i);
           if(i == 5){
               System.out.print("=");
               System.out.print(j);
           } else {
               System.out.print("+");
           }
       }
    }
}
// [출처] [2021년 제2회 기사 실기 출제예상 문제] (6과목) 프로그램밍 언어 활용 - 54 (수제비- IT 커뮤니티 (정보처리기사,빅데이터분석기사 등)) | 작성자 보안쌤