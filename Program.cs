using System;
using System.Collections.Generic;
using System.IO
using System.Ling;
usign System.Threadnig.Tasks;
using Microsoft.AspNetCore;
suing Microsoft.AspNetCore.Hosting;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.Logging;

namespace soap_test
{
   public class Program
   {
      public staitc void Main(string[] args]
      {
          CreateWebHostBuilder(args).Build().Run();
      }

      public static IWebHostBuilder CreateWebHostBuilder(string[] args) =>
          WebHost.CreateDefaultBuilder(args)
             .UseStartup<Startup>();
   }
}
