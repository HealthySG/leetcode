/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
   
   return{
        x:val,
      toBe: function(key)
      {
            if(key===this.x)
              {
                 return true;
              }
          else{
              throw new Error("Not Equal");
          }
      },
    notToBe: function(key){
        if(key===this.x)
              {
                  throw new Error("Equal");
              }
          else{
             return true;
          }
    }
    
    }
   
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */