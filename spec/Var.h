#ifndef __ATOME__VAR__H__
#define __ATOME__VAR__H__

#include <string>
#include <iostream>
#include "Atome.h"

class Var : public Atome{
 private:
  std::string name;
 public:
  Var(std::string n);
  virtual ~Var();
  virtual void print(std::ostream s);
  virtual bool isVar();
};

#endif
