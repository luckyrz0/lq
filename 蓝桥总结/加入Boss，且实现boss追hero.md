# 加入Boss，且实现boss追hero
1. - 设置boss的图片变量，位置变量
```java
Image bossimg;
int bossX;
int bossY;
```
2. - 进行boss的图片赋值，位置赋值，以及boss显示
```java
bossimg=Image.createImage("/zuzu000.png");
bossX=0;
bossY=0;
g.drawImage(bossimg,bossX,bossY,0);
```
3. - 要实现boss不停的追hero，有进行死循环
```java
while(true){
    if(bossX<heroX){
			bossX++;
		}
		else{
			bossX--;
		}
		if(bossY<heroY){
			bossY++;

		}
		else{4.
			bossY--;
		}
		}
		repaint();
		}
}
```
4. - 进行屏幕刷新

- 定义Thread变量：
```java
Thread thread;
```
- new 一个对象：
```java
thread=new Thread(this);
```
- 设置刷新的开始：
```java
thread.start();
```
- 设置刷新的频率：
```java
Thread.sleep(200);
```
5. - 设置boss有1/3概率追hero
- 导入随机数模块：
```java
import java.util.*;
```
- new 一个对象：
```java
Random p=new Random();
```
- 产生10以内的随机数：
```java
int h=p.nextInt(10);
```
