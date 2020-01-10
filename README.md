# FragmentActivityPassValue
### 自学，用来记录fragment和activity之间的传值

### 1.activity向fragment传值：
activity中设值：<br>
通过bundle对象存储值，然后setarguments<br>
fragment中取值：<br>
通过新建bundle对象，getatguments和相应的key获取值<br>

### 2.fragment向activity传值
fragment中定义传值的回调接口，在onattch或者oncreate方法中获取接口的实现<br>
fragment需要传值的位置调用接口回调方法传值<br>
activity实现回调接口，重写回调方法获取传递的值<br>

### 3.fragment间的传值方式
A.如果两个fragment在同一个activity中，可以在其中一个fragment中通过getfragmentManager.findFragmentbyid获取另一个fragment对象实例，然后调用赋值方法<br>
B.如果两个fragment在同一个activity中，可以在其中一个fragment中通过getfragmentManager.findFragmentbyid获取另一个fragment对象实例，然后通过getview获取整个view,在通过findviewbyid获取控件<br>
C.如果两个fragment在同一个activity中，先调用fragment所属的activity，在调用findviewbyid获取控件<br>
D.eventbus传值，待续<br>

