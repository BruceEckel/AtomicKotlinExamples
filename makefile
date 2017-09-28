JC = "/Program Files/Java/jdk1.8.0_102/bin/javac.exe"

%Kt.class: %.kt
	kotlinc $<

%.class: %.java
	echo %PATH%
	$JC $<

all: BeanClass.class RandomKt.class UseBeanClassKt.class

