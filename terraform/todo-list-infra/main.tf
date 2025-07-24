resource "aws_instance" "vm2" {

  ami             = var.ami
  instance_type   = var.instance_type
  key_name        = var.key_pair
  security_groups = var.security_groups
  tags = {
    Name = var.instnace_name
  }


}