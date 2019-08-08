# ADialog  
仿ios对话框  
1、可以自定义对话框样式、只显示一个button、显示标题/不显示标题、标题文字大小颜色、消息文字大小颜色以及button字体大小颜色的设置。  
2、加载框提示文字，样式颜色。  

To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

### gradle

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}Copy
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.fangood:ADialog:1.0.0.0'
	}  
	
### maven  
<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>Copy
Step 2. Add the dependency  
<dependency>
	    <groupId>com.github.fangood</groupId>
	    <artifactId>ADialog</artifactId>
	    <version>1.0.0.0</version>
	</dependency>

	
	
	
效果图
-------
![效果图](/images/image1.jpg)  

![效果图](/images/image2.jpg)  

![效果图](/images/image3.jpg)  

![效果图](/images/image4.jpg)  

![效果图](/images/image5.jpg)  

![效果图](/images/image6.jpg)

