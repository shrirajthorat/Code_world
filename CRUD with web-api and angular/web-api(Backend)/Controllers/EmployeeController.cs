using System;
using System.Collections.Generic;
using System.Data;
using System.Data.Entity;
using System.Data.Entity.Infrastructure;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web;
using System.Web.Http;
using MvcApplication1.Models;
using System.Web.Http.Cors;

namespace MvcApplication1.Controllers
{
    
   
    [EnableCors(origins: "http://localhost:4200", headers: "*", methods: "*")]
        public class EmployeeController : ApiController
    {
       
        private msdbEntities db = new msdbEntities();

        // GET api/Employee
         
        public IEnumerable<Empdemo> GetEmpdemoes()
        {
            return db.Empdemoes.AsEnumerable();
        }

        // GET api/Employee/5
        public Empdemo GetEmpdemo(int id)
        {
            Empdemo empdemo = db.Empdemoes.Find(id);
            if (empdemo == null)
            {
                throw new HttpResponseException(Request.CreateResponse(HttpStatusCode.NotFound));
            }

            return empdemo;
        }

        // PUT api/Employee/5
        public HttpResponseMessage PutEmpdemo(int id, Empdemo empdemo)
        {
            if (ModelState.IsValid && id == empdemo.code)
            {
                db.Entry(empdemo).State = EntityState.Modified;

                try
                {
                    db.SaveChanges();
                }
                catch (DbUpdateConcurrencyException)
                {
                    return Request.CreateResponse(HttpStatusCode.NotFound);
                }

                return Request.CreateResponse(HttpStatusCode.OK);
            }
            else
            {
                return Request.CreateResponse(HttpStatusCode.BadRequest);
            }
        }

        // POST api/Employee
        public HttpResponseMessage PostEmpdemo(Empdemo empdemo)
        {
            if (ModelState.IsValid)
            {
                db.Empdemoes.Add(empdemo);
                db.SaveChanges();

                HttpResponseMessage response = Request.CreateResponse(HttpStatusCode.Created, empdemo);
                response.Headers.Location = new Uri(Url.Link("DefaultApi", new { id = empdemo.code }));
                return response;
            }
            else
            {
                return Request.CreateResponse(HttpStatusCode.BadRequest);
            }
        }

        // DELETE api/Employee/5
        public HttpResponseMessage DeleteEmpdemo(int id)
        {
            Empdemo empdemo = db.Empdemoes.Find(id);
            if (empdemo == null)
            {
                return Request.CreateResponse(HttpStatusCode.NotFound);
            }

            db.Empdemoes.Remove(empdemo);

            try
            {
                db.SaveChanges();
            }
            catch (DbUpdateConcurrencyException)
            {
                return Request.CreateResponse(HttpStatusCode.NotFound);
            }

            return Request.CreateResponse(HttpStatusCode.OK, empdemo);
        }

        protected override void Dispose(bool disposing)
        {
            db.Dispose();
            base.Dispose(disposing);
        }
    }
}