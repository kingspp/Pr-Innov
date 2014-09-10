'''
Created on 28-Aug-2014

@author: prathyush
'''
print "Clock Angle"
dangle=0.0
hr=int(raw_input("Enter the Hour: "))
min=int(raw_input("Enter the Min: "))
dir=int(raw_input("Enter the Direction \n 1.Clockwise \n 2.AntiClockwise \n:"))

if dir==1:
    dmin=min*6
    dhr=(hr*30)+(0.5*min)
    dangle=abs(dhr-dmin)
    
elif (dir==2):
    if min==0:
        min=60
    dmin=60-(min)
    t=dmin
    dmin=dmin*6
    dhr=12-hr
    dhr=(dhr*30)+(0.5*t)
    dangle=abs(dhr-dmin)
    
print "The angle formed by Hour hand and Minute Hand is: "+str(dangle)
