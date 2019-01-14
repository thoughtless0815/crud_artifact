
    function f() {

        console.log("Problem");
        var first_name = $('#name').val();
        var flag = false;
        var password = $('#password').val();
        console.log("Problem " + password+" "+password.length);
        $(".error").remove();

        if (first_name.length < 1) {
            $('#name').after('<span class="error">This field is required</span>');
            flag = true;
        }
        if (password.length < 8) {
            $('#password').after('<span class="error">Password must be at least 8 characters long</span>');
            flag = true;
        }
    return !flag;
    }
