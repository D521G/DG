# java与Http协议

### 一、Http协议详解请求
```
//请求行
POSE /reg.jsp HTTP/ (CRLF)

//消息报头
Accept:image/gif,image/x-xbitmap,image/jpeg,application/x-shockwave-flash,application/vnd.ms-excel,application/vnd.ms-powerpoint,application/msword,*/* (CRLF)
Accept-Language:zh-cn (CRLF)
Accept-Encoding:gzip,deflate (CRLF)
If-Modified-Since:Wed,05 Jan 2007 11:21:25 GMT (CRLF)
If-None-Match:W/"80b1a4c018f3c41:8317" (CRLF)
User-Agent:Mozilla/4.0(compatible;MSIE6.0;Windows NT 5.0) (CRLF)
Host:www.guet.edu.cn (CRLF)
Connection:Keep-Alive (CRLF)
(CRLF)

//请求正文
user=jeffrey&pwd=1234 

```
    以上是HTTP请求的三部：请求行，消息报头、请求正文
    
    请求行以一个方法符号开头，以空格分开，后面跟着请求的URI和协议的版本，格式如下：
    
    Method Request-URI HTTP-Version CRLF  
    
    其中 Method表示请求方法(如POST、GET、PUT、DELETE等)；
    RequestURI是一个统一资源标识符；HTTP-Version表示请求的HTTP协议版本；
    CRLF表示回车和换行。

### 二 HTTP协议详情之响应篇

```
//状态行
HTTP/1.1 200 OK (CRLF)

//消息报头
Cache-Control: private, max-age=30
Content-Type: text/html; charset=utf-8
Content-Encoding: gzip
Expires: Mon, 25 May 2009 03:20:33 GMT
Last-Modified: Mon, 25 May 2009 03:20:03 GMT
Vary: Accept-Encoding
Server: Microsoft-IIS/7.0
X-AspNet-Version: 2.0.50727
X-Powered-By: ASP.NET
Date: Mon, 25 May 2009 03:20:02 GMT
Content-Length: 12173

//响应正文
```

    HTTP响应也是由三个部分组成，分别是：状态行、消息报头、响应文
    
    
    状态行格式如下：
    
        HTTP-Version Status-Code Reason-Phrase CRLF
        
    其中，HTTP-Version表示服务HTTP协议的版本；
    Status-Code表示服务器发回的响应状态代码；
    Reason-Phrase表示状态代码的文本描述。
    
    常见状态代码、状态描述、说明：
    200 OK      //客户端请求成功
    400 Bad Request  //客户端请求有语法错误，不能被服务器所理解
    401 Unauthorized //请求未经授权，
    这个状态代码必须和WWW-Authenticate报头域一起使用 
    403 Forbidden  //服务器收到请求，但是拒绝提供服务
    404 Not Found  //请求资源不存在，eg：输入了错误的URL
    500 Internal Server Error //服务器发生不可预期的错误
    503 Server Unavailable  //服务器当前不能处理客户端的请求，一段时间后可能恢复正常

### HTTP协议详解之消息报头

    HTTP消息由客户端到服务器的请求和服务器到客户端的响应组成。
    请求消息和响应消息都是由开始行（对于请求消息，开始行就是请求行；
    对于响应消息，开始行就是状态行），消息报头（可选），
    空行（只有CRLF的行），消息正文（可选）组成。
    HTTP消息报头包括普通报头、请求报头、响应报头、实体报头。
    每一个报头域都是由名字+“：”+空格+值 组成，消息报头域的名字是大小写无关的。
    
    1 请求报头
        请求报头允许客户端向服务器端传递请求的附加信息以及客户端自身的信息。
    
    Accept请求报头域用于指定客户端接受哪些类型的信息。
    Accept-Charset请求报头域用于指定客户端接受的字符集。
    Accept-Encoding请求报头域类似于Accept，但是它是用于指定可接受的内容编码。
    Accept-Language请求报头域类似于Accept，但是它是用于指定一种自然语言。
    Authorization请求报头域主要用于证明客户端有权查看某个资源。
    
    Host请求报头域主要用于指定被请求资源的Internet主机和端口号，
    它通常从HTTP URL中提取出来的。User-Agent请求报头域允许客户端
    将它的操作系统、浏览器和其它属性告诉服务器。
    
    2 响应报头
    
        响应报头允许服务器传递不能放在状态行中的附加响应信息，以
        及关于服务器的信息和对Request-URI所标识的资源进行下一步
        访问的信息。
        
    常用的响应报头
    Location响应报头域用于重定向接受者到一个新的位置。
    Location响应报头域常用在更换域名的时候。
    Server响应报头域包含了服务器用来处理请求的软件信息
    
    3. 实体报头
    
    请求和响应消息都可以传送一个实体。
    
    常用的实体报头
    Content-Encoding指示已经被应用到实体正文的附加内容的编码。
    Content-Language实体报头域描述了资源所用的自然语言。
    Content-Length实体报头域用于指明实体正文的长度，以字节方式存
    储的十进制数字来表示。
    Content-Type实体报头域用语指明发送给接收者的实体正文的媒体类型。
    Last-Modified实体报头域用于指示资源的最后修改日期和时间。
    Expires实体报头域给出响应过期的日期和时间。
    
### 四 补充
    1、HTTP协议Content Lenth限制漏洞导致拒绝服务攻击
    使用POST方法时，可以设置ContentLenth来定义需要传送的数据长，
    例如ContentLenth:999999999，在传送完成前，内存不会释放，攻击
    者可以利用这个缺陷，连续向WEB服务器发送垃圾数据直至WEB服务器
    内存耗尽。这种攻击方法基本不会留下痕迹。
    
    2.为了提高用户使用浏览器时的性能，现代浏览器还支持并发的访问
    方式，浏览一个网页时同时建立多个连接，以迅速获得一个网页上的
    多个图标，这样能更快速完成整个网页的传输。HTTP1.1中提供了这
    种持续连接的方式，而下一代HTTP协议：HTTP-NG更增加了有关会话
    控制、丰富的内容协商等方式的支持，来提供更高效率的连接。
    
### 五 java利用HTTP协议实现联网和下载

> Url的请求连接（Get方式）
```
String currentUrl=“http://www.myWeb.com/login.jsp?userName='Devin'&passWord='mypassword'”; //URL ?后面的内容为HTTP请求的正文
URL url = new URL(currentUrl);
 
HttpURLConnection httpurlconnection = url.openConnection();
//下面的设置对应HTTP请求中的消息报头
httpurlconnection.setRequestProperty("User-Agent",CommonValues.User_Agent);
httpurlconnection.setRequestProperty("Accept",CommonValues.Accept);
httpurlconnection.setRequestProperty("Accept-Charset",CommonValues.Accept_Charset);
httpurlconnection.setRequestProperty("Accept-Language",CommonValues.Accept_Language);
httpurlconnection.setRequestProperty("Connection",CommonValues.Connection);
httpurlconnection.setRequestProperty("Keep-Alive",CommonValues.Keep_Alive);
httpurlconnection.setConnectTimeout(CommonValues.ConnectionTimeOut);
httpurlconnection.setReadTimeout(CommonValues.ReadTimeOut);
             
httpurlconnection.connect();
            
int responsecode = httpurlconnection.getResponseCode();
             
if(responsecode == HttpURLConnection.HTTP_OK) //对应HTTP响应中状态行的响应码
{
　　//操作请求流，这里对应HTTP响应中的响应正文
}
             
if (httpurlconnection != null) 
{
   httpurlconnection.disconnect();
}
```
    
    
    
    