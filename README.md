[![GitHub release](https://img.shields.io/github/release/abcdqianlei1990/LoadingButton.svg)](https://github.com/abcdqianlei1990/LoadingButton/releases)
# LoadingButton
带loading效果的button

## showing
![image](https://raw.githubusercontent.com/abcdqianlei1990/LoadingButton/master/raw/loadintButton.gif)


## How To
### Step 1. Add the JitPack repository to your build file
```groovy
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
### Step 2. Add the dependency
```groovy
dependencies {
	        compile 'com.github.abcdqianlei1990:LoadingButton:1.2'
	}
```

## Sample
```java
mLoadingButton.setBtnOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mButton.startLoading();
                mButton.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mButton.loadingComplete();
                    }
                },2000);
            }
        });
```
## Attrs
|name|note|
|:----|:------|
|btnText|button text|
|quickClickLimit|quick click limit|
