/**
 * Created by pocan on 2017/5/31.
 */

var elem = $("#loading");

$("#clearBtn").click(function () {
    console.log("clearBtn clicked");
    console.log("location.href" + location.href);
    if(confirm("确定要清空所有数据吗？")){
        elementAction(elem);
        setTimeout(function() {
            window.location.href = location.href + "/empty/user";
        }, 2000);
    } else {
        return;
    }
});



/**
 * 控制元素显示隐藏
 * @param elem
 */
function elementAction(elem) {
    var state = elem.attr("state");
    if(state == 'show') {
        elem.hide();
        elem.attr("state", 'hide');
    } else {
        elem.show();
        elem.attr("state", 'show');
    }
}