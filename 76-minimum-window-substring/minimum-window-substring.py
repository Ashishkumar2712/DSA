class Solution:
    
    def comparearr(self,l1,l2):
        for i,v in enumerate(l1):
            if v > l2[i]:
                return False
        return True

    def minWindow(self, s: str, t: str) -> str:
        l1 = [0 for i in range(58)]
        l2 = [0 for i in range(58)]
        for i in t:
            l1[ord(i)-ord('A')] = l1[ord(i)- ord('A')] + 1
        
        i = 0
        q = 0
        mini = 1000000
        ans= ""
        while q < len(s):
            l2[ord(s[q])-ord('A')] = l2[ord(s[q])-ord('A')] + 1
            c = self.comparearr(l1,l2)
            if c:
                while self.comparearr(l1,l2) and i < len(s):
                    if q - i + 1 < mini:
                        ans=s[i:q+1]
                    mini = min(q - i + 1, mini)
                    
                    l2[ord(s[i])-ord('A')] = l2[ord(s[i])-ord('A')] - 1
                    i = i + 1
                    

                
            q = q + 1
        return ans
