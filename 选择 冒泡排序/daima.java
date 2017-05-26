先都按从小到大排序：
1.冒泡排序源码：
 
Java代码
float[] scores = {0.0f,2.0f,3.0f,1.0f}; 
         
        //定义临时变量 
        float temp = 0.0f; 
        //进行冒泡排序：i控制比较多少轮，j控制每轮比较多少次 
        for(int i = 0;i < scores.length - 1;i++){ 
            for(int j=0;j < scores.length - 1 - i;j++){ 
                if(scores[j] > scores[j+1]){ 
                    temp = scores[j]; 
                    scores[j] = scores[j+1]; 
                    scores[j+1] = temp; 
                } 
            } 
        } 
 
 2.选择排序法源码：
Java代码  www.2cto.com
float[] scores = {0.0f,2.0f,3.0f,1.0f}; 
         
        //定义临时变量 
        float temp = 0.0f; 
        //找到最小值索引 
        int min; 
        for(int i=0;i < scores.length - 1;i++){ 
            min = i; 
            for(int j = i + 1;j < scores.length;j++){ 
                if(scores[j] < scores[min]){ 
                    min = j; 
                } 
            } 
             
            if(min != i){ 
                temp = scores[min]; 
                scores[min] = scores[i]; 
                scores[i] = temp; 
            } 
        } 