'''
Created on Aug 23, 2014

@author: Prathyush
'''


import time
print 'Word Count:'

def letter_count(word, char):
    count = 0
    for ch in word:
        if char == ch:
            count += 1
    return count

inp=raw_input("Enter the String: ")
start=time.time()
i,x=0,0
while(i<len(inp)):
    x=letter_count(inp, inp[i])
    print (inp[i]+str(x)),    
    i+=1    

print ""
end=time.time()
print "Time Elapsed is:" + str(end-start)+'s'
