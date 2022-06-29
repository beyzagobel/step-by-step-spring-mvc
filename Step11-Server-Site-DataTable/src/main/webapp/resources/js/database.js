/*$(document).ready(function () {
    $('#employeeDataTable').DataTable();
});

 */

$('#employeeDataTable').DataTable(
    {
        serverSide: true,
        processing: true,
        ajax:{
            url:'employees',
            method: 'POST',
            dataType: 'JSON'
        },
        columns : [
            {data : 'employeeId'},
            {data : 'fname'}

        ]
    }
);
