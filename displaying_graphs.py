# -*- coding: utf-8 -*-
"""
In this module we will be displaying stats about which source is giving more
fake news and in what proportion.
"""
from matplotlib import pyplot as plt
a=87
b=90
c=67
d=75
e=91
f=69
g=83
h=71
i=77
labels=["IGN","Independent","Buzzfeed","CNBC","The Washington Post","GoogleNews","Techradar","ESPN","MTV"]
#labels1=["Gaming","Education","Entertainment","Economy","World","Top News","Technology","Sports","Music"]
data_source=[a,b,c,d,e,f,g,h,i]
colors=['gold','red','blue','green','lightcoral','orange','yellowgreen','pink','brown']
plt.pie(data_source,labels=labels,colors=colors,autopct='%1.1f%%')
plt.title("Sources with Reality Check")
plt.axis('equal')
#plt.pie(data_source1)
plt.show()
me="ESPN"
if me=="IGN":
    ign=[a,100-a]
    plt.pie(ign,labels=["Truth","Fake"],autopct='%1.1f%%')
    plt.title("IGN")
    plt.show()
elif me=="Independent":
    indepe=[b,100-b]
    plt.pie(ign,labels=["Truth","Fake"],autopct='%1.1f%%')
    plt.title("IGN")
    plt.show()
elif me=="Buzzfeed":
    bf=[c,100-c]
    plt.pie(bf,labels=["Truth","Fake"],autopct='%1.1f%%')
    plt.title("Buzzfeed")
    plt.show()
elif me=="CNBC":
    cnbc=[d,100-d]
    plt.pie(cnbc,labels=["Truth","Fake"],autopct='%1.1f%%')
    plt.title("CNBC")
    plt.show()
elif me=="The Washington Post":
    twp=[e,100-e]
    plt.pie(twp,labels=["Truth","Fake"],autopct='%1.1f%%')
    plt.title("The Washington Post")
    plt.show()
elif me=="GoogleNews":
    gn=[f,100-f]
    plt.pie(gn,labels=["Truth","Fake"],autopct='%1.1f%%')
    plt.title("GoogleNews")
    plt.show()
elif me=="Techradar":
    tr=[g,100-g]
    plt.pie(tr,labels=["Truth","Fake"],autopct='%1.1f%%')
    plt.title("Techradar")
    plt.show()
elif me=="ESPN":
    espn=[h,100-h]
    plt.pie(espn,labels=["Truth","Fake"],autopct='%1.1f%%')
    plt.title("ESPN")
    plt.show()
elif me=="MTV":
    mtv=[i,100-i]
    plt.pie(mtv,labels=["Truth","Fake"],autopct='%1.1f%%')
    plt.title("MTV")
    plt.show()