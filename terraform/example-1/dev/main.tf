
resource "aws_instance" "vm_1" {
  ami             = var.ami
  instance_type   = var.instance
  key_name        = var.key
  security_groups = var.security
  tags = {
    Name = "${var.intance_name}"
  }
}