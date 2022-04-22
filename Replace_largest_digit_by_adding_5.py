# Find the largest digit in the number. 
# Replace that digit by adding 5 to it.
# Input:102 Output:107
# Input 555 Output: 558

n = 102

st=str(n)
l=list(map(int, st))
mxst=st[0]
mx = int(max(l))
#print(mx)

for i in range(len(l)):
    if l[i]==mx:
        ind = i
print(ind)
ad = 5+l[ind] 
#print(ad)
lll = []
lll+=l[:ind]
lll.append(ad)
lll+=l[ind+1:]
#print(lll)
#print(end='')
#print(type(lll[0]))
ans=""
for po in lll:
    ans += (str(po))
print(ans)
