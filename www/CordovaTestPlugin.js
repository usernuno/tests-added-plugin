var exec = require('cordova/exec');

module.exports = {
    crash: function(successCallback, errorCallback) {
        exec(successCallback, errorCallback, 'CordovaTestPlugin', 'crash', []);
    }
};
