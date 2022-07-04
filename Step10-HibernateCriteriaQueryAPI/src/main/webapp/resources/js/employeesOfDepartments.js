function employeesOfDepartments(value) {
    let url = value;
    $.ajax({
        type: "GET",
        url: url,
        success: function (response) {
        },
        dataType: "json"
    });
}