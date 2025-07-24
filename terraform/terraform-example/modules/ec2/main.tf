resource "aws_instance" "ec2_instance" {
  ami             = var.ami
  instance_type   = var.intance
  key_name        = var.key_pair
  security_groups = var.security
  tags = {
    Name = var.instance_name
  }

}