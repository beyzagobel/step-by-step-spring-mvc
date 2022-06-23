$("#buttonUpdate").click(function () {
    let url = "";
    let email = $("#email").val();

    if (email) {
        $.ajax({
            type: "POST",
            url: url,
            data: {
                email: email,

            },
            success: function (response) {
                alert("Success!")
            },
            dataType: "json"
        });
    } else {
        alert("Failed!")
    }
});
