�ȶ�����С��������
1.ð������Դ�룺
 
Java����
float[] scores = {0.0f,2.0f,3.0f,1.0f}; 
         
        //������ʱ���� 
        float temp = 0.0f; 
        //����ð������i���ƱȽ϶����֣�j����ÿ�ֱȽ϶��ٴ� 
        for(int i = 0;i < scores.length - 1;i++){ 
            for(int j=0;j < scores.length - 1 - i;j++){ 
                if(scores[j] > scores[j+1]){ 
                    temp = scores[j]; 
                    scores[j] = scores[j+1]; 
                    scores[j+1] = temp; 
                } 
            } 
        } 
 
 2.ѡ������Դ�룺
Java����  www.2cto.com
float[] scores = {0.0f,2.0f,3.0f,1.0f}; 
         
        //������ʱ���� 
        float temp = 0.0f; 
        //�ҵ���Сֵ���� 
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