#import "CordovaTestPlugin.h"

@interface CordovaTestPlugin ()
@end

@implementation CordovaTestPlugin

- (void)crash:(CDVInvokedUrlCommand*)command {
    dispatch_sync(dispatch_get_main_queue(), ^{
        @throw [NSException exceptionWithName:@"Crash"
                                       reason:@"This is a test crash from CordovaTestPlugin"
                                     userInfo:nil];
    });
}

@end
