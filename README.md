Run all tests using
```bash
./gradlew check
```
The tests on ios will fail:
```
io.ktor.client.engine.darwin.DarwinHttpRequestException: Exception in http request: Error Domain=NSURLErrorDomain Code=-1202 "The certificate for this server is invalid. You might be connecting to a server that is pretending to be “echo.zuplo.io” which could put your confidential information at risk." UserInfo={NSLocalizedRecoverySuggestion=Would you like to connect to the server anyway?, _kCFStreamErrorDomainKey=3, NSErrorPeerCertificateChainKey=(
    "<cert(0x7fc57101a200) s: sni.cloudflaressl.com i: Cloudflare Inc ECC CA-3>",
    "<cert(0x7fc57101b800) s: Cloudflare Inc ECC CA-3 i: Baltimore CyberTrust Root>"
), NSErrorClientCertificateStateKey=0, NSErrorFailingURLKey=https://echo.zuplo.io/, NSErrorFailingURLStringKey=https://echo.zuplo.io/, NSUnderlyingError=0x600000302190 {Error Domain=kCFErrorDomainCFNetwork Code=-1202 "(null)" UserInfo={_kCFStreamPropertySSLClientCertificateState=0, kCFStreamPropertySSLPeerTrust=<SecTrustRef: 0x600003c00640>, _kCFNetworkCFStreamSSLErrorOriginalValue=-9807, _kCFStreamErrorDomainKey=3, _kCFStreamErrorCodeKey=-9807, kCFStreamPropertySSLPeerCertificates=(
    "<cert(0x7fc57101a200) s: sni.cloudflaressl.com i: Cloudflare Inc ECC CA-3>",
    "<cert(0x7fc57101b800) s: Cloudflare Inc ECC CA-3 i: Baltimore CyberTrust Root>"
)}}, _NSURLErrorRelatedURLSessionTaskErrorKey=(
    "LocalDataTask <58436AC1-A94E-473E-A2D6-B98B3EC4CA7C>.<1>"
), _kCFStreamErrorCodeKey=-9807, _NSURLErrorFailingURLSessionTaskErrorKey=LocalDataTask <58436AC1-A94E-473E-A2D6-B98B3EC4CA7C>.<1>, NSURLErrorFailingURLPeerTrustErrorKey=<SecTrustRef: 0x600003c00640>, NSLocalizedDescription=The certificate for this server is invalid. You might be connecting to a server that is pretending to be “echo.zuplo.io” which could put your confidential information at risk.}
io.ktor.client.engine.darwin.DarwinHttpRequestException: Exception in http request: Error Domain=NSURLErrorDomain Code=-1202 "The certificate for this server is invalid. You might be connecting to a server that is pretending to be “echo.zuplo.io” which could put your confidential information at risk." UserInfo={NSLocalizedRecoverySuggestion=Would you like to connect to the server anyway?, _kCFStreamErrorDomainKey=3, NSErrorPeerCertificateChainKey=(
    "<cert(0x7fc57101a200) s: sni.cloudflaressl.com i: Cloudflare Inc ECC CA-3>",
    "<cert(0x7fc57101b800) s: Cloudflare Inc ECC CA-3 i: Baltimore CyberTrust Root>"
), NSErrorClientCertificateStateKey=0, NSErrorFailingURLKey=https://echo.zuplo.io/, NSErrorFailingURLStringKey=https://echo.zuplo.io/, NSUnderlyingError=0x600000302190 {Error Domain=kCFErrorDomainCFNetwork Code=-1202 "(null)" UserInfo={_kCFStreamPropertySSLClientCertificateState=0, kCFStreamPropertySSLPeerTrust=<SecTrustRef: 0x600003c00640>, _kCFNetworkCFStreamSSLErrorOriginalValue=-9807, _kCFStreamErrorDomainKey=3, _kCFStreamErrorCodeKey=-9807, kCFStreamPropertySSLPeerCertificates=(
    "<cert(0x7fc57101a200) s: sni.cloudflaressl.com i: Cloudflare Inc ECC CA-3>",
    "<cert(0x7fc57101b800) s: Cloudflare Inc ECC CA-3 i: Baltimore CyberTrust Root>"
)}}, _NSURLErrorRelatedURLSessionTaskErrorKey=(
    "LocalDataTask <58436AC1-A94E-473E-A2D6-B98B3EC4CA7C>.<1>"
), _kCFStreamErrorCodeKey=-9807, _NSURLErrorFailingURLSessionTaskErrorKey=LocalDataTask <58436AC1-A94E-473E-A2D6-B98B3EC4CA7C>.<1>, NSURLErrorFailingURLPeerTrustErrorKey=<SecTrustRef: 0x600003c00640>, NSLocalizedDescription=The certificate for this server is invalid. You might be connecting to a server that is pretending to be “echo.zuplo.io” which could put your confidential information at risk.}
	at kotlin.Exception#<init>(/opt/buildAgent/work/5f69639f351c4725/kotlin/kotlin-native/runtime/src/main/kotlin/kotlin/Exceptions.kt:25)
	at io.ktor.utils.io.errors.IOException#<init>(/opt/buildAgent/work/49d4a482a8522285/ktor-io/posix/src/io/ktor/utils/io/errors/IOException.kt:4)
	at io.ktor.utils.io.errors.IOException#<init>(/opt/buildAgent/work/49d4a482a8522285/ktor-io/posix/src/io/ktor/utils/io/errors/IOException.kt:5)
	at io.ktor.client.engine.darwin.DarwinHttpRequestException#<init>(/opt/buildAgent/work/8d547b974a7be21f/ktor-client/ktor-client-darwin/darwin/src/io/ktor/client/engine/darwin/DarwinUtils.kt:61)
	at io.ktor.client.engine.darwin#handleNSError(/opt/buildAgent/work/8d547b974a7be21f/ktor-client/ktor-client-darwin/darwin/src/io/ktor/client/engine/darwin/TimeoutUtils.kt:28)
	at io.ktor.client.engine.darwin.internal.DarwinTaskHandler#complete(/opt/buildAgent/work/8d547b974a7be21f/ktor-client/ktor-client-darwin/darwin/src/io/ktor/client/engine/darwin/internal/DarwinTaskHandler.kt:59)
	at io.ktor.client.engine.darwin.internal.DarwinResponseReader#objc:URLSession:task:didCompleteWithError:(/opt/buildAgent/work/8d547b974a7be21f/ktor-client/ktor-client-darwin/darwin/src/io/ktor/client/engine/darwin/internal/DarwinResponseReader.kt:29)
	at <global>._696f2e6b746f723a6b746f722d636c69656e742d64617277696e_knbridge155(/opt/buildAgent/work/8d547b974a7be21f/ktor-client/ktor-client-darwin/darwin/src/io/ktor/client/engine/darwin/internal/DarwinResponseReader.kt:27)
	at /Applications/Xcode.app/Contents/Developer/Platforms/iPhoneOS.platform/Library/Developer/CoreSimulator/Profiles/Runtimes/iOS.simruntime/Contents/Resources/RuntimeRoot/System/Library/Frameworks/CFNetwork.framework/CFNetwork(Unknown Source)
	at <global>.__NSBLOCKOPERATION_IS_CALLING_OUT_TO_A_BLOCK__(Unknown Source)
	at <global>.-[NSBlockOperation(Unknown Source)
	at <global>.__NSOPERATION_IS_INVOKING_MAIN__(Unknown Source)
	at <global>.-[NSOperation(Unknown Source)
	at <global>.__NSOPERATIONQUEUE_IS_STARTING_AN_OPERATION__(Unknown Source)
	at <global>.__NSOQSchedule_f(Unknown Source)
	at <global>._dispatch_block_async_invoke2(Unknown Source)
	at <global>._dispatch_client_callout(Unknown Source)
	at <global>._dispatch_continuation_pop(Unknown Source)
	at <global>._dispatch_async_redirect_invoke(Unknown Source)
	at <global>._dispatch_root_queue_drain(Unknown Source)
	at <global>._dispatch_worker_thread2(Unknown Source)
	at <global>._pthread_wqthread(Unknown Source)
	at <global>.start_wqthread(Unknown Source)
```

The issue seems to be related to the `--standalone` simulator: if we boot the device and then spawn the test process
using `xcrun` everything works as expected.
```bash
export DEVICE="iPhone 12"
xcrun simctl boot $DEVICE
xcrun simctl spawn $DEVICE ./build/bin/iosX64/debugTest/test.kexe
xcrun simctl shutdown $DEVICE
```
OUTPUT:
```
##teamcity[testSuiteStarted name='SampleTest' id='SampleTest' locationHint='kotest:class://SampleTest:1']
##teamcity[testStarted name='Ktor get should work' id='SampleTest/Ktor get should work' parent_id='SampleTest']
HttpResponse[https://echo.zuplo.io/, 200 OK]
##teamcity[testFinished name='Ktor get should work' id='SampleTest/Ktor get should work' parent_id='SampleTest' duration='833' result_status='Success']
##teamcity[testSuiteFinished name='SampleTest' id='SampleTest' locationHint='kotest:class://SampleTest:1']
```

But if we instead use `--standalone` we get the same errors:
```bash
export DEVICE="iPhone 12"
xcrun simctl spawn --standalone $DEVICE ./build/bin/iosX64/debugTest/test.kexe
```
OUTPUT:
```
##teamcity[testSuiteStarted name='SampleTest' id='SampleTest' locationHint='kotest:class://SampleTest:1']
##teamcity[testStarted name='Ktor get should work' id='SampleTest/Ktor get should work' parent_id='SampleTest']
Invalid connection: com.apple.coresymbolicationd
##teamcity[testFailed name='Ktor get should work' id='SampleTest/Ktor get should work' parent_id='SampleTest' duration='420' message='Exception in http request...' result_status='Error']
##teamcity[testFinished name='Ktor get should work' id='SampleTest/Ktor get should work' parent_id='SampleTest' duration='420' result_status='Error']
##teamcity[testSuiteFinished name='SampleTest' id='SampleTest' locationHint='kotest:class://SampleTest:1']
```
