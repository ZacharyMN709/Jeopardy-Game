import os
import platform as p

plat = p.system()
os.system('javac Main.java')
if(plat == 'Windows'): os.system('java -cp . Main')
if(plat == 'Linux'): os.system('java Main')
