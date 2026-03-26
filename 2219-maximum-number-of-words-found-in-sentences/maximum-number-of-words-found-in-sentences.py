class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        v=0
        for i in range(len(sentences)):
            c=1
            k=sentences[i]
            for j in range(len(k)):
                if k[j]==" ":
                    c=c+1
            v=max(v,c)
        return v
                
                
           
            
        