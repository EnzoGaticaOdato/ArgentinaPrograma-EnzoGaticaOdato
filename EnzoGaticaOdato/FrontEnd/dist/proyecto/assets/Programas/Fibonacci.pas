program Fibonacci;

uses SysUtils;
var
scanner:string;
function RecursivaFibo(n:integer):integer;
begin
    if (n<2) then
        RecursivaFibo:=n
    else 
        RecursivaFibo:=RecursivaFibo(n-1)+RecursivaFibo(n-2);
end;
begin 
    scanner:='0';
    while(scanner<>'-1') do begin
        write('Ingrese un numero para calcular su Fibonacci(ingrese -1 para salir):');
        readln(scanner);
        if (scanner<>'-1')then 
            writeln('Fibonacci de '+scanner+'= '+IntToStr(RecursivaFibo(strtoint(scanner))));
    end;
    writeln('Adios! Gracias por usar este programa de Lucas');
end.